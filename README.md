# pizza
Se aplicaron los patrones de Fábrica para los tipos de Pizza y Estretegia para las promociones.
<br>
### Lista con codigos:
#### - COD1 Pizza Margarita
#### - COD2 Pizza Peperoni
#### - COD3 Pizza Personalizada

## - Dias de prmociones:
#### - MARTES Y MIERCOLES 
* 2x1
#### - JUEVES             
* Entrega gratis
#### - LUNES VIERNES SABADO DOMINGO
 * Sin promocion
  
### Pedir una orden de Pizza

localhost:8087/api/order/COD1/MIERCOLES

`curl --location --request GET 'localhost:8087/api/order/COD1/MIERCOLES' \
--data-raw ''`
<br>
Response:
<code>
{
    "promocion": "Se aplico la promocion 2x1",
    "pizza": "Se preparó una pizza Margarita!"
}
</code>
<br>
<br>


localhost:8087/api/order/COD3/JUEVES

`curl --location --request GET 'localhost:8087/api/order/COD3/JUEVES' \
--data-raw ''`
<br>
<code>
{
    "promocion": "Se aplico la promocion Entrega gratis",
    "pizza": "Se preparó una pizza Personalizada!"
}
</code>

