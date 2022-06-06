import axios from "axios";
export default async  function (number){
    const {data: user} = await axios("https://jsonplaceholder.typicode.com/users/" + number)  
    const {data: post} = await axios("https://jsonplaceholder.typicode.com/posts?userId=" + number)
    
    const result = Object.assign(user, post)
    
    return result;
}