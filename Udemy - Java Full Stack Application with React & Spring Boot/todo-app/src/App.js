import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
 
class App extends Component {
  render() {
    return (
      <div className="App">
        Here comes my app
        <FirstComponent></FirstComponent>
        <SecondComponent></SecondComponent>
        <ThirdComponent></ThirdComponent>
      </div>
      
    );
  }
}

//class Component
class FirstComponent extends Component {
  render() {
    return (
      <div className="firstComponent">
        FirstComponent
      </div>
    );
  }
}

//class Component
class SecondComponent extends Component {
  render() {
    return (
      <div className="SecondComponent">
        SecondComponent
      </div>
    );
  }
}

//function Component
function ThirdComponent (){
return(
      <div className="ThirdComponent">
        ThirdComponent
      </div>
    );
  }

export default App;
