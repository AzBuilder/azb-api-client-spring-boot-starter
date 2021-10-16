package org.azbuilder.api.client.model.organization.job;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.api.client.model.generic.Resource;

import java.util.List;

@Getter
@Setter
public class StepData {
    List<Resource> data;
}