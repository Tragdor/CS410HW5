public class Face {

	Vertex[] vertices = new Vertex[3];
	Mtl mtl;
	
	public Face(Vertex[] VERTICES){
		vertices = VERTICES;
	}
	
	public Face(Vertex[] VERTICES, Mtl MTL){
		vertices = VERTICES;
		mtl = MTL;
	}
}