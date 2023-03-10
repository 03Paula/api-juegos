# api-juegos
## Partida

| Endpoint                | Resultado                                                    | Método |
|-------------------------|--------------------------------------------------------------| :----: |
| `/partidas`             | Mostrar todas las partidas                                   |  GET   |
| `/partidas`             | Añadir una partida                                           |  POST  |
| `/partida/{id}`         | Mostrar la partida con el id `{id}`                          |  GET   |
| `/partida/{id}`         | Eliminar una partida                                         | DELETE |
| `/partida/{id}`         | Modificar una partida                                        |  PUT   |
| `/partida/jugador/{id}` | Mostrar las partidas con los jugadores que tengan esa `{id}` |  GET   |
