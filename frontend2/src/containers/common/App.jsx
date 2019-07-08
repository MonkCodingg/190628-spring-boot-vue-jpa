import React, {Component} from 'react';
import '../../assets/css/App.css';
import MyNav from '../../components/MyNav.jsx';


class App extends Component{
  
  render(){
    return (
      <div className="App">
        <MyNav></MyNav>
      </div>
    );
  }
    
}

export default App;
