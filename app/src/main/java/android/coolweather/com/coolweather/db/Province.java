package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 25729 on 2021/4/18.
 */

public class Province extends DataSupport {
    private int id;
    private  String provinceName;//省名
    private  int provinceCode;//省代号

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
