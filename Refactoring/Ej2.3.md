# Ejercicio 2.3

### Código original
```java
/**
* Retorna los últimos N posts que no pertenecen al usuario user
*/
public List<Post> ultimosPosts(Usuario user, int cantidad) {
        
    List<Post> postsOtrosUsuarios = new ArrayList<Post>();
    for (Post post : this.posts) {
        if (!post.getUsuario().equals(user)) {
            postsOtrosUsuarios.add(post);
        }
    }
        
   // ordena los posts por fecha
   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
       int masNuevo = i;
       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
     postsOtrosUsuarios.get(masNuevo).getFecha())) {
              masNuevo = j;
           }    
       }
      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
      postsOtrosUsuarios.set(masNuevo, unPost);    
   }
        
    List<Post> ultimosPosts = new ArrayList<Post>();
    int index = 0;
    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
    while (postIterator.hasNext() &&  index < cantidad) {
        ultimosPosts.add(postIterator.next());
    }
    return ultimosPosts;
}
```
##### Bad Smell: Long Method
##### Refactoring: Extract Method
```java
public List<Post> ultimosPosts(Usuario user, int cantidad) {
    List<Post> postsOtrosUsuarios = postOtrosUsuarios(user);
    List<Post> postsOtrosOrdenada = ordenarPost(postOtrosUsuarios);
    List<Post> ultimosPosts = ultimosPosts(postsOtrosOrdenada, cantidad);
      
   
      
        
    
}
    private List<Post> postsOtrosUsuario (Usuario user){
      new ArrayList<Post>();
      for (Post post : this.posts) {
          if (!post.getUsuario().equals(user)) {
              postsOtrosUsuarios.add(post);
          }
      return postsOtrosUsuarios;
    }
    private List<Post> ordenarPost (List<Post> postsOtros){
      List<Post> posts = postsOtros;
      for (int i = 0; i < posts.size(); i++) {
       int masNuevo = i;
       for(int j= i +1; j < posts.size(); j++) {
           if (posts.get(j).getFecha().isAfter(
               posts.get(masNuevo).getFecha())) {
              masNuevo = j;
           }    
       }
        Post unPost = posts.set(i,postsOtrosUsuarios.get(masNuevo));
        posts.set(masNuevo, unPost);    
      }
    }
    private ultimosPosts(postsOtrosOrdenada, cantidad){
      List<Post> ultimosPosts = new ArrayList<Post>();
      int index = 0;
      Iterator<Post> postIterator = postsOtrosOrdenada.iterator();
      while (postIterator.hasNext() &&  index < cantidad) {
        ultimosPosts.add(postIterator.next());
      }
    return ultimosPosts;
    }
```
