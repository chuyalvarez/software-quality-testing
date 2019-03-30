const express = require('express');
const app = express();
const path = require('path');
const router = express.Router();
const reader = express.Router();
const hostname = '127.0.0.1';
const port = 8000;

router.get('/',function(req,res){
  res.sendFile(path.join(__dirname+'/index.html'));
  //__dirname : It will resolve to your project folder.
});

app.use('/', router);
app.listen(process.env.port || port);

console.log(`Server running at http://${hostname}:${port}/`);
