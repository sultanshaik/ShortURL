import React, { Component } from 'react';
import ListComponent from './ListComponent.js'
import './App.css';

class App extends Component {

  constructor()
  {
    super();
    this.state = {listofUrls:{}, Urltoshorten:''}
  }

  handleChange =(e)=>
  {
    this.setState({Urltoshorten : e.target.value}, ()=>
    {
      console.log(this.state.Urltoshorten)
    }
  );
  }

  render() {
    return (
      <div>
		      <form>
		            <input 	type="text"
		            placeholder="Url to shorten" value = {this.state.Urltoshorten} onChange = {this.handleChange} />
		<button className="" onClick = {this.handleSubmit}  >Add Url</button>
		</form>
    <ListComponent />
	  </div>
    );
  }
}

export default App;
