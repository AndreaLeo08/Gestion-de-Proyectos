public class Objeto {
    private int _id;    private String _nombreObeto;

    public Objeto(){

    }

    public Objeto(String nombreObjeto) {

        this._nombreObjeto = nombreObjeto;    }


    public void set_id(int _id) {
        this._id = _id;    }

    public void set_nombreObjeto(String _nombreObjeto) {
        this._nombreObjeto = _nombreObjeto;    }


    public int get_id() {
        return _id;    }

    public String get_nombreObjeto() {
        return _nombreObjeto;    }
}