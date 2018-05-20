import React, { Component } from 'react';
import "./Listcomponent.css";
import 'react-bootstrap';
class ListComponent extends Component{

    componentWillReceiveProps(nextProps)
    {
      if(nextProps.listofUrls!==this.props.listofUrls)
      {
        this.props = nextProps;
      }
    }

    handleDelete=(id)=>{
        if(window.confirm("Do you really want to remove this url?"))
        this.props.deleteURL(id);
    }

    render() {
      return (
        <div className = "List-body">
          <table>
            <thead>
              <tr>
                <td className = "well"><h3>Url</h3></td>
                <td className = "well"><h3>Shortened version of the url</h3></td>
              </tr>
            </thead>
            <tbody>
              {
                this.props.listofUrls.map((x,i)=>{
                  return(
                    <tr key={i}>
                      <td>{x.actualURL}</td>
                      <td><a href = {x.actualURL}>{x.shortURL}</a></td>
                      <td><button className="Button-delete" onClick = {()=>this.handleDelete(x.id)}>Remove</button></td>
                    </tr>
                )
              }
            )}

            </tbody>
          </table>
        </div>
      );
    }
}

export default ListComponent;
