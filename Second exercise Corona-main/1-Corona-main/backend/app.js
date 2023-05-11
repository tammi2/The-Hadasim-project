const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const membersRoutes = require('./routes/members');
require('dotenv').config();

const app = express();

//conent to db
mongoose.connect(process.env.MONGODB_URI, 
{ useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => {
    console.log('Connected to MongoDB');
  })
  .catch((err) => {
    console.error('Error connecting to MongoDB', err);
  });

app.use(bodyParser.json());
app.use(express.json());

app.use('/members', membersRoutes);

app.listen(5000, () => {
  console.log('Server started on port 5000');
});