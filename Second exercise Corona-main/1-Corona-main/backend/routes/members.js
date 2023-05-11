const express = require('express');
const membersController = require('../controllers/membersController');

const router = express.Router();

router.get('/', membersController.getAllMembers);
router.get('/:id', membersController.getMemberById);
router.post('/', membersController.addMember);
router.post('/:id/corona', membersController.addCoronaDetails);


module.exports = router;