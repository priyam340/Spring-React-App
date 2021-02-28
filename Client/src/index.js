import React, { Suspense } from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom'
import Display from './Display';


const Root=()=>{

  return (
<Suspense fallback= {<div>Loading....</div>}>
<Router>
  <Switch><Route path="/display" component={Display}/>
<Route path="/" component={App}/>



</Switch>

</Router>
</Suspense>
  );

}
ReactDOM.render(
  
<Root/>
 ,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
