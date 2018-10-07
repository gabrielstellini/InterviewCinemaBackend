# CCBill Cinema interview task (backend)

## Project Details

This project was designed to be a backend for [CinemaFrontEnd](https://github.com/gabrielstellini/InterviewCinemaFrontEnd). It makes use of Spring and Hibernate.

## Requirements

- Java 8
- MySql
- Maven

## Installation and deployment

Initialise the database and grant spring access to your sql instance:
```
CREATE DATABASE db_cinema;
USE db_cinema;
CREATE USER 'springuser'@'localhost' IDENFIED BY 'ThePassword';
```

Clone the repo.
Run the server using `mvn spring-boot:run`. The data will be seeded automatically into the database.

## Tests
Run the tests using `mvn test`
Two sample tests were provided under the tests directory.

## ERD
![ERD](https://raw.githubusercontent.com/gabrielstellini/InterviewCinemaBackend/master/ERD.png)

## API endpoints

##### Bookings
URI: `/booking`
METHOD: `POST`
DESCRIPTION: Adds a new booking
```
{
  seatId: number,
  filmId: number
}
```

##### Cinemas
URI: `/cinemas`
METHOD: `GET`
DESCRIPTION: Gets all the cinemas
```
[{
  cinemaId: string
  address: string
  name: string
}]
```
URI: `/cinemas/{id}`
METHOD: `GET`
DESCRIPTION: Gets further cinema details - mainly theatres
```
[{
  cinemaId:
  ScreenName:
}]
```

##### Films
URI: `/films`
METHOD: `GET`
DESCRIPTION: Gets all the films

```
[{
  name: string
  description: string
  image: string
  theatreId: number
}]
```

URI: `/films/{id}`
METHOD: `GET`
DESCRIPTION: Gets a specific film ID

```
{
  name: string
  description: string
  image: string
  theatreId: number
}
```

#### Booking
URI: `/films/{filmId}/theatre/{theatreId}/seats`
METHOD: `GET`
DESCRIPTION: Gets seat details

```
[{
  seatid: number,
  occupied: boolean,
  row: number
}]
```
