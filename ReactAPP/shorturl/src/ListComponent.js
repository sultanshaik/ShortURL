import React, { Component } from 'react';

class ListComponent extends Component{

    constructor(props)
    {
      super(props);
    }

    componentWillReceiveProps(nextProps)
    {
      if(nextProps.listofUrls!==this.props.listofUrls)
      {
        this.props = nextProps;
      }
    }

    render() {
      return (
        <div>
          <table>
  <thead>
  <tr>
        <td>Actual Url</td>
        <td>Short URl</td>
  </tr>
  </thead>
  <tbody>
  {
    this.props.listofUrls.map((x,i)=>{
          return(
                  <tr key={i}>
                  <td>{x.actualURL}</td>
                  <td>{x.shortURL}</td>
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
