public class BuilderPizza {
        protected Pizza _pizza;

        public Pizza build() {
            return this._pizza;
        }

        public BuilderPizza() {

            _pizza = new Pizza();
        }

        public BuilderPizza setTipoMasa(int tipoMasa) {
            _pizza.setTipoMasa(tipoMasa);
            return this;
        }

        public BuilderPizza setSize(int size) {
            _pizza.setSize(size);
            return this;
        }

        public BuilderPizza setRelleno(boolean relleno) {
            _pizza.setRellena(relleno);
            return this;
        }

        public BuilderPizza setCebolla(boolean cebolla) {
            _pizza.setCebolla(cebolla);
            return this;
        }

        public BuilderPizza setSinGluten(boolean sinGluten){
            _pizza.setSinGluten(sinGluten);
            return this;
        }

        public BuilderPizza setRecojida(int recojida) {
            _pizza.setRecojida(recojida);
            return this;
        }
    }



