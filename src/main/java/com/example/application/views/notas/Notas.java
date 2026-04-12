package com.example.application.views.notas;

public abstract class Notas {
        private double parcial;
        private double taller;
        private double proyecto;

        public double getParcial() {
            return parcial;
        }

        public double getTaller() {
            return taller;
        }

        public double getProyecto() {
            return proyecto;
        }

        public void setParcial(double parcial){
            if (parcial > 5 || parcial < 1) {
                throw new IllegalArgumentException("Nota inválida, debe estar entre 1.0 y 5.0");
            }
            this.parcial = parcial;
        }
        public void setTaller(double taller){
            if (taller > 5 || taller < 1) {
                throw new IllegalArgumentException("Nota inválida, debe estar entre 1.0 y 5.0");
            }
            this.taller = taller; 
        }
        public void setProyecto(double proyecto){
            if (proyecto > 5 || proyecto < 1) {
                throw new IllegalArgumentException("Nota inválida, debe estar entre 1.0 y 5");
            }
            this.proyecto = proyecto; 
        }
        public Notas(double parcial, double taller, double proyecto){
            this.setParcial(parcial);
            this.setTaller(taller);
            this.setProyecto(proyecto);
        }
}