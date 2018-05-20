import React, { Component } from 'react';
import ListComponent from './ListComponent.js'
import './App.css';

class App extends Component {

  constructor()
  {
    super();
    this.state = {listofUrls:[], Urltoshorten:''}
  }

  filter(x){
  return	x;
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
    this.setState({Urltoshorten : e.target.value}, ()=>
      {
        console.log(this.state.Urltoshorten)
      }
    );
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
          .then(this.fetchUrls())
          .catch(error=>{});


  }

  handleSubmit = (e)=>
  {
      e.preventDefault();
      this.addNewUrl();
  }

  render() {
    return (
      <div className = "App-body">
          <span className="glyphicons glyphicons-wifi-alt"></span>
          <h1>URL Shortener</h1>
		      <form>
		            <input 	type="text"
		            placeholder="Url to shorten" value = {this.state.Urltoshorten} onChange = {this.handleChange} />
		            <button className="Button-add" onClick = {this.handleSubmit}  >Add Url</button>
		      </form>
          <ListComponent listofUrls = {this.state.listofUrls} />
	  </div>
    );
  }
}

export default App;
