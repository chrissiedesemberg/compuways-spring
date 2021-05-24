import React, { Component } from "react"; //When using jsx - we need the 'React,'

// import logo from "./logo.svg"; // show image
// import FirstComponent from "./components/learning-examples/FirstComponent";
// import SecondComponent from "./components/learning-examples/SecondComponent";
// import ThirdComponent from "./components/learning-examples/ThirdComponent";
// import Counter from "./components/counter/Counter";
import TodoApp from "./components/todo/TodoApp";
import "./App.css";
import "./bootstrap.css";

class App extends Component {
  render() {
    return (
      <div className="App">
        {/* <LearningComponents></LearningComponents> */}
        {/* <Counter/> */}
        <TodoApp />
      </div>
    );
  }
}

// class LearningComponents extends Component {
//   render() {
//     return (
//       <div className="LearningComponents">
//         Here comes my app
//         <FirstComponent></FirstComponent>
//         <SecondComponent></SecondComponent>
//         <ThirdComponent></ThirdComponent>
//       </div>
//     );
//   }
// }

export default App;