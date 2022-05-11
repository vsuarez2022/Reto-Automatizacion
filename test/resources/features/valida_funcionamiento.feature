#autor:Veronica Suarez
  #language:es

@stories
Característica: Validar  funcionamiento de la pagina opencart
  como usuario
  quiero ingresar a la pagina de opencart
  para validar el funcionamiento

  @Escenario1
  Esquema del escenario: validar logeo en la pagina opencart
    Dado que se ingresa a la pagina opencart
    Cuando se ingresa credenciales de logeo
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Entonces valida que el logeo sea exitoso
    Ejemplos:
      | usuario | contrasenna |
      | demo    | demo        |


  @Escenario2
  Esquema del escenario:Realizar compras de articulos
    Dado que el usuario de la pagina
    Cuando agrega productos al carro
      | NombreProducto   | cantidad   |
      | <nombreProducto> | <cantidad> |
    Entonces el usuario ve los productos en el carro de compras

    Ejemplos:
      | nombreProducto | cantidad |
      | AppleCinema30  | 1        |








