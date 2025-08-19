package com.example.chriss.forohub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,

        String titulo,
        String mensaje,
        StatusTopico status,
        String autor,
        String curso
) {
}
