import React, { Component } from "react";
import PropTypes from "prop-types";
import "./counter.css";

class Counter extends Component {
  constructor() {
    super();
    this.state = {
      counter: 0,
    };
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.reset = this.reset.bind(this);
  }

  increment(by) {
    this.setState((prevState) => {
      return { counter: prevState.counter + by };
    });
  }

  decrement(by) {
    this.setState((prevState) => {
      return { counter: prevState.counter - by };
    });
  }

  reset() {
    this.setState(() => {
      return { counter: 0 };
    });
  }

  render() {
    return (
      <div className="counter">
        <CounterButton
          by={1}
          incrementMethod={this.increment}
          decrementMethod={this.decrement}
        />
        <CounterButton
          by={5}
          incrementMethod={this.increment}
          decrementMethod={this.decrement}
        />
        <CounterButton
          by={10}
          incrementMethod={this.increment}
          decrementMethod={this.decrement}
        />
        <CounterButton
          by={100}
          incrementMethod={this.increment}
          decrementMethod={this.decrement}
        />
        <span className="count">{this.state.counter}</span>
        <br></br>
        <button id="reset" onClick={this.reset}>
          Reset
        </button>
      </div>
    );
  }
}

class CounterButton extends Component {
  constructor() {
    super();
  }
  render() {
    return (
      <div className="Counter">
        <button onClick={() => this.props.incrementMethod(this.props.by)}>
          +{this.props.by}
        </button>
        <button onClick={() => this.props.decrementMethod(this.props.by)}>
          -{this.props.by}
        </button>
      </div>
    );
  }
}

CounterButton.defaultProps = {
  by: 1,
};

CounterButton.propTypes = {
  by: PropTypes.number,
};

export default Counter;
