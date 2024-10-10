package com.demo_microservice.web.enums;

public enum ProductoEnum {

	VERSION {
		public String getDescription() {
			return "1.0.0";
		}
	},
	NOMBRE_API {
		public String getDescription() {
			return "demo-microservice";
		}
	},
	FECHA_API {
		public String getDescription() {
			return "10-10-2024";
		}
	},
    CODIGO_EXITOSO {
        public String getDescription() {
            return "200";
        }
    },
    CODIGO_PRODUCTO_EXISTENTE {
        public String getDescription() {
            return "400";
        }
    },
	MENSAJE_EXITOSO {
		public String getDescription() {
			return "Registro Exitoso";
		}
	},
	MENSAJE_PRODUCTO_EXISTENTE {
		public String getDescription() {
			return "El Producto Ya Existe";
		}
	},
	MENSAJE_ERROR {
		public String getDescription() {
			return "Registro Fallido";
		}
	};

	public abstract String getDescription();
}
