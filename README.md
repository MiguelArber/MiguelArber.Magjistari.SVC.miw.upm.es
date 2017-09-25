### MIW - Práctica 1: Ingeniería Web - Visión General
> #### Asignatura: *Ingeniería Web: Visión General*
> #### [Máster en Ingeniería Web por la U.P.M.]
---

### Aclaraciones

Para la realización de la práctica se ha intentado seguir lo mejor posible todas las indicaciones proporcionadas en el enunciado del trabajo.

Para realizar las pruebas de cada issue al final de cada iteración se ha usado el fichero *test.sh* (puede ser ejecutado en un entorno basado en *unix* mediante el comando bash: ```. test.sh &```).

Para crear el paquete correspondiente a las releases se ha usado el fichero *package.sh* (puede ser ejecutado en un entorno basado en *unix* mediante el comando bash: ```. package.sh &```).

Se han enviado a remoto todas las ramas con las que se ha trabajado para este proyecto. Esto no es estrictamente necesario (ya que estas ramas aparecen en la carpeta **.git** adjuntada en moodle), sin embargo, se ha realizado esta acción para poder realizar un mejor seguimiento en linea de los cambios en el proyecto.

La rama *issue#04* fue creada para agregar a *develop* los cambios realizados en la rama *release1.0*. Tras finalizar todo el trabajo leí en el documento de criterios de evaluación que dichos cambios no deben ser implementados en *develop* (entendí lo contrario la primera vez que lo leí). Entiendo que estos cambios son los correspondientes a una pre-release y no siempre es necesario agregarlos a *develop*. Tomo nota de ello.

En la release *v1.0.1* subí (por error), además del .jar correspondiente (el de la *v1.0.1*), el de la *v1.0.0*. Eliminé el archivo en local pero por alguna razón git no actualizó el cambio. Para solucionarlo habría que crear un nuevo *hotfix#02*, crear la release *v1.0.2* eliminando dicho archivo y actualizar *master*. No llevé acabo estos pasos para no salimre demasiado del guión de la práctica. Apunto también esta aclaración.

---

#### Repo name: MiguelArber.Magjistari.SVC.miw.upm.es
