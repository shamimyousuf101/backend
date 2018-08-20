Feature:Registration service

  Scenario:post register - registers users into database/in memory
    Response contains
    /register

    POST

    Success 201
    Wrong format/dat 400/415
    Failure - 500




  Scenario:get register - return already registered users

  /register

  GET

  Success 200
  Not Found 404
  Failure - 500
