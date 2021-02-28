import logo from './logo.svg';
import './App.css';
import React ,{useState} from 'react';
import axios from 'axios';
import { useHistory } from "react-router-dom";
const  App=() =>{
  const history = useHistory();
  const [id,setId]=useState();
  const handle=async e=>{
 try{
   e.preventDefault();
const res=await axios({
  method:'get',
  url:'http://localhost:6500/hello?id='+id
})
console.log(res.data)
history.push("/display",{data:res.data});
  }catch(Err)
 {
   console.log(Err);
 }
  }
  return (
    <div className="App">
    <form onSubmit={handle}>
      <input value={id} onChange={e=>setId(e.target.value)} />
      <button type="submit">Submit</button>
    </form>
    </div>
  );
}

export default App;
