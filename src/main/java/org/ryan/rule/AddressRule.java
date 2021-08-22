package org.ryan.rule;

import org.ryan.dto.RuleDto;

public class AddressRule extends AbstractRule{

    public boolean execute(RuleDto dto) {
        System.out.println("AddressRule invoke!");
        if(dto.getAddress().startsWith("a")){
            return true;
        }
        return false;
    }
}
