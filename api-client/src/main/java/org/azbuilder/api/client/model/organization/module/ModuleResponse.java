package org.azbuilder.api.client.model.organization.module;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ModuleResponse {
    List<Module> data;
}
