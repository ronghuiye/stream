package org.ryan.rule;

import org.ryan.dto.NationalityRuleDto;
import org.ryan.dto.RuleDto;

public class NationalityRule extends AbstractRule{
    @Override
    protected <T> boolean executeRule(T t) {
        System.out.println("NationalityRule invoke!");
        NationalityRuleDto nationalityRuleDto = (NationalityRuleDto) t;
        if(nationalityRuleDto.getNationality().startsWith("a")){
            return true;
        }

        return false;
    }

    @Override
    protected <T> T convert(RuleDto dto) {
        NationalityRuleDto nationalityRuleDto = new NationalityRuleDto();
        if(dto.getAddress().startsWith("a")){
            nationalityRuleDto.setNationality("a");
        }
        return (T) nationalityRuleDto;
    }
}
