import React, { Component } from 'react';

class ListComponent extends Component{

    constructor(props)
    {
      super(props);
      this.state = {listofUrls : []}

    }

    filter(x){
		return	x;
	}

    fetchUrls(){

      fetch("http://localhost:8080/urls").
            then(response=>response.json()).
                then(response =>
                  {
                    this.setState(
                        {listofUrls : this.filter(response)}
                  )
                }).catch(function(error) {
    });
}

    componentDidMount(){

		   this.fetchUrls();
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
  {this.state.listofUrls.map((x,i)=>{
    return(
      <tr key={i}>
        <td>{x.actualURL}</td>
        <td>{x.shortURL}</td>
      </tr>
      )
    }
  )
  }
  </tbody>
   </table>


        </div>
      );
    }

}

export default ListComponent;
