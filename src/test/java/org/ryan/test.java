package org.ryan;

import org.junit.jupiter.api.Test;
import org.ryan.dto.RuleDto;
import org.ryan.rule.AddressRule;
import org.ryan.rule.NationalityRule;
import org.ryan.service.RuleService;

import java.util.Arrays;

public class test {
    @Test
    public void execute(){

        AddressRule addressRule = new AddressRule();
        NationalityRule nationalityRule = new NationalityRule();

        RuleDto dto = new RuleDto();
        dto.setAge(5);
        dto.setAddress("abcd");

        boolean ruleResult = RuleService
                .create()
                .and(Arrays.asList(addressRule))
                .or(Arrays.asList(nationalityRule))
                .execute(dto);
        System.out.println("execute result : " + ruleResult);
    }
}
