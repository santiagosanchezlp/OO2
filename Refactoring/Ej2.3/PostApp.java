public class PostApp {
/**
* Retorna los últimos N posts que no pertenecen al usuario user
*/
//Bad Smell: Long Method
//Refactoring: Replace Temp with Query
//    public List<Post> ultimosPosts(Usuario user, int cantidad) {
//            
//        List<Post> postsOtrosUsuarios = new ArrayList<Post>();
//        for (Post post : this.posts) {
//            if (!post.getUsuario().equals(user)) {
//                postsOtrosUsuarios.add(post);
//            }
//        }
//            
//    // ordena los posts por fecha
//    for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
//        int masNuevo = i;
//        for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
//            if (postsOtrosUsuarios.get(j).getFecha().isAfter(
//        postsOtrosUsuarios.get(masNuevo).getFecha())) {
//                masNuevo = j;
//            }    
//        }
//        Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
//        postsOtrosUsuarios.set(masNuevo, unPost);    
//    }
//            
//        List<Post> ultimosPosts = new ArrayList<Post>();
//        int index = 0;
//        Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
//        while (postIterator.hasNext() &&  index < cantidad) {
//            ultimosPosts.add(postIterator.next());
//        }
//        return ultimosPosts;
//    }
//Bad Smell: 
//Refactoring: Rename Method

    public List<Post> ultimosPostsOtrosUsuarios(Usuario user, int cantidad) {
                
            return this.posts.stream()
            .filter(u->!u.getUsuario().equals(user))
            .sorted((f1, f2) -> f1.getFecha().compareTo(f2.getFecha()));
            .limit(cantidad)
            .collect(Collectors.toList());    
        }