# Java Web Taller 7
# Julian David Tique Arias - 2687351
# Java Avanzado

- En este repositorio tenemos un registrar usuarios, registrar productos y registrar categorias de forma visual y ya no solo por consola. En este repositorio vamos a como se logró este formulario.

- Modificar form de los formularios: en la etiqueta form tenemos 2 atributos el action y el method. El action es donde se va a controlar la información, el method es como va a viajar la información en este caso por el metodo post. 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/3ca7b3c9-864d-4ad7-b4e8-23c444e57d11)

- Crear un sub-paquete llamado servlets 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/de560802-63ca-45e8-9d79-9ef90a21bd6d)

dentro de este sub-paquete va a contener la clase que va a funcionar como el controlador 

- Archivo UsersRegisterServlets: 

- empezamos con que este archivo herede la clase HttpServlet y usando un atributo protegido y sin valor de retorno. Ademas de esto llamamos a traves de WebServlet le pasamos el nombre del action de nuestro formulario. 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/af6b49bc-0c32-43b9-bbe5-7ed5bc71c4fb)

- Ahora conseguimos toda la informacion del formulario a traves del atributo name.

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/c078e5a6-b2c4-4f05-b87b-34f3d14b511e)

- Ahora rellenamos la clase Bean de Usuario en este caso

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/95dc2ade-0598-4503-b255-ff8788b32a0c)

- Ahora llamamos al repository y guardamos el objeto en la base de datos 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/c11aafc0-71d8-4d82-a226-3f162adc422b)

- Ya por ultimo enviamos un mensaje por consola para el registro exitoso, o en caso de que falle se envia un mensaje por consola. 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/17b58eaf-d4da-4bc1-a61c-0ed43997ea61)

- Hicimos lo mismo con Producto y Categoria 

- Producto(Formulario):

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/09126006-f2bd-42a2-b37c-c22217bee5a0)

-Categoria(Formulario): 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/07861a19-fe68-44b2-8f3a-2524ba1a8613)

-Producto Servlet: 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/17c4b590-ce79-484f-8d56-c025190c6741)

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/1c68ec35-cdca-4a92-b917-b56772d29c38)

-Categoria Servlet: 

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/0063b7f4-247a-4f0b-8dd0-2a436d555bea)

![image](https://github.com/julian79110/JavaWebTaller7/assets/128442954/5a511d46-0d48-4dc7-ba1e-a6f8802a4840)





















