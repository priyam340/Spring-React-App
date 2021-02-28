import React ,{useState} from 'react';
const Display=(props)=>{


return (

    <h1>hi {props.history.location.state.data.name}</h1>
)


}
export default Display;