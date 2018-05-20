import React, { Component } from 'react';
import ListComponent from './ListComponent.js'
import './App.css';

class App extends Component {

  constructor()
  {
    super();
    this.state = {listofUrls:[], Urltoshorten:'', isValidURl: true}
  }

  filter(x){
  return	x;
}

testforValidURL(input){
        return input.startsWith("http://") && input.length>11F;
}

  fetchUrls(){

    fetch("http://localhost:8080/urls")
          .then(response=>response.json())
              .then(response =>
                {
                  this.setState(
                      {listofUrls : this.filter(response)}
                )
              }
            ).catch(function(error) {
                console.log(error)
  });
}

  componentWillMount()
  {
      this.fetchUrls();
  }

  handleChange =(e)=>
  {
    this.setState({Urltoshorten : e.target.value});
  }

  addNewUrl()
  {
        var initvalues = {
            method: 'POST',
            headers: {
                    'Content-Type': 'text/plain'
                  },
            body:    this.state.Urltoshorten
          }
          fetch("http://localhost:8080/urls" ,initvalues)
          .then(()=>this.fetchUrls())
          .catch(error=>{});


  }

  handleSubmit = (e)=>
  {
      e.preventDefault();
      let validity = this.testforValidURL(this.state.Urltoshorten);
      this.setState({isValidURl : validity} );
      if(validity)
      {
        this.addNewUrl();

      }
  }

  deleteURL = (id)=>
  {
    var initvalues = {
        method: 'DELETE'
      }
      fetch("http://localhost:8080/urls/"+id ,initvalues)
      .then(()=>this.fetchUrls())
      .catch(error=>{});
  }

  render() {
    return (
      <div className = "App-body">
          <span className="glyphicons glyphicons-wifi-alt"></span>
          <h1>URL Shortener</h1>
		      <form>
		            <input 	type="text"
		            placeholder="Url to shorten" value = {this.state.Urltoshorten} onChange = {this.handleChange} />
		            <button className="Button-add" onClick = {(e)=>this.handleSubmit(e)}  >Add Url</button>
		      </form>
          {this.state.isValidURl ?  null: <p><small>Please enter a valid url starting with "http://"</small></p> }
          {this.state.listofUrls.length ? <ListComponent listofUrls = {this.state.listofUrls} deleteURL = {this.deleteURL} /> : null}
	  </div>
    );
  }
}

export default App;
