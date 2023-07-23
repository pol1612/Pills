package personal.pol.sanejove.pills.entities;

import java.util.Date;

public class Day {
    private Date Day;
    private Boolean ThirtyGramsPill;
    private Boolean TwentyGramsLiquid;
    private Boolean TenGramsPill;

    public Day (){
        Day = new Date();
        ThirtyGramsPill = false;
        TwentyGramsLiquid = false;
        TenGramsPill = false;
    }
    public Date getDay() {
        return Day;
    }

    public void setDay(Date day) {
        Day = day;
    }

    public Boolean getThirtyGramsPill() {
        return ThirtyGramsPill;
    }

    public void setThirtyGramsPill(Boolean thirtyGramsPill) {
        ThirtyGramsPill = thirtyGramsPill;
    }

    public Boolean getTwentyGramsLiquid() {
        return TwentyGramsLiquid;
    }

    public void setTwentyGramsLiquid(Boolean twentyGramsLiquid) {
        TwentyGramsLiquid = twentyGramsLiquid;
    }

    public Boolean getTenGramsPill() {
        return TenGramsPill;
    }

    public void setTenGramsPill(Boolean tenGramsPill) {
        TenGramsPill = tenGramsPill;
    }
}
