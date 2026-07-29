package br.com.masiesque.ZZDjdbc.Domain;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder

public class Producer {
    private Integer id;
    private String name;


    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'+'\n';
    }
}
