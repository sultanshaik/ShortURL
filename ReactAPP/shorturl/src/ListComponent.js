import React, { Component } from 'react';
import "./Listcomponent.css";
class ListComponent extends Component{

    componentWillReceiveProps(nextProps)
    {
      if(nextProps.listofUrls!==this.props.listofUrls)
      {
        this.props = nextProps;
      }
    }

    handleDelete=(e)=>{
        this.props.DeleteURL;
    }

    render() {
      return (
        <div className = "List-body">
          <table>
            <thead>
              <tr>
                <td>Url</td>
                <td>Shortened version of the url</td>
              </tr>
            </thead>
            <tbody>
              {
                this.props.listofUrls.map((x,i)=>{
                  return(
                    <tr key={i}>
                      <td>{x.actualURL}</td>
                      <td>{x.shortURL}</td>
                      <td><button className="Button-delete" onClick = {this.handleDelete}>Remove</button></td>
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
