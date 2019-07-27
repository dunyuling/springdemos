##docker 操作 mongodb
    + mongo
        + 查找mongo image
            * docker search mongo
        + 拉取 Mongo image
            * docker pull mongo
        + 运行mongo image
            * docker run -d --name mongodb --volume /usr/local/mongodata:/data/db -p 27017:27017 mongo --auth
        + 创建root用户
            * $ docker exec -it mongodb mongo     
            * >use admin
            * show dbs
            * db.createUser({user:'root', pwd:'mongo',roles:[{role:'root',db:'admin'}]})  
    + mongo-express
        + 查找 mongo-express image
            * docker search mongo-express
        + 拉取 mongo-express image
            * docker pull mongo-express 
        + 运行 mongo-express image
            * docker run -d 
                --name mongo-express -p 8081:8081  
                --link mongo:mongo 
                --env ME_CONFIG_MONGODB_ADMINUSERNAME='root' 
                 --env ME_CONFIG_MONGODB_ADMINPASSWORD='mongo' 
                  mongo-express   
        +                       