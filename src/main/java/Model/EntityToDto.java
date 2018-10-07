package Model;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class EntityToDto<D, E>{
    public D toDto(E entity, D dto) {
        if(entity != null & dto != null) {
            BeanUtils.copyProperties(entity, dto);
            return dto;
        }
        else {
            return null;
        }
    }

    public List<D> toDto(List<E> entity, D dto){
        List<D> dtos = new LinkedList<>();

        for (E anEntity : entity) {
            dtos.add(this.toDto(anEntity, dto));
        }

        return dtos;
    }
}
