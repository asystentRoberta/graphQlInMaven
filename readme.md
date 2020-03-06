### Simple Graphql service with "database" in list to test advantages of this solution.
* [Description](#_)
* [Notes](#Notes)
* [Deploy](#Deploy)
###### _
Project based on springboot.

You can read about GraphQL [here.](https://graphql.org/)

By the way it turned out that in some companies  still use Maven, so I have to make some review (I used maven once).

![Logo](http://bohdziewicz.com.pl/images_share/graphql_spring.png)


[![Actions Status](https://github.com/asystentRoberta/graphQlInMaven/workflows/mavenBuild/badge.svg)](https://github.com/asystentRoberta/graphQlInMaven/actions)

###### Notes
After add  dependency:
```
        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphiql-spring-boot-starter</artifactId>
            <version>5.0.2</version>
        </dependency>
```

at endpoind at localhost:8080/graphiql you can find nice editor for graphiql query. Take a look:

![screenshotOfGraphiQl](http://bohdziewicz.com.pl/images_share/graphqlPanel.jpg)


###### Deploy

Always better try then see so you can visit this "app" on heroku servers:
[deployedOnHeroku](https://graphql-demonstartion.herokuapp.com/graphiql)

And then you can try query:

```
query{
  getMovies(limit:10){
    title
    genre
    id
  }
}
```

or try create record:

``` 
mutation{
  createMovie(title:"testOne", genre:"comedy"){
    id
    title
    genre
  }
}
```

Feel free to experiment :)