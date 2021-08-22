package org.ryan.rule;

import org.ryan.dto.RuleDto;

public interface BaseRule {
    boolean execute(RuleDto dto);
}
