package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 25729 on 2021/4/18.
 */

public class City extends DataSupport {
    private  int id;
    private  String CityName;//市名
    private  int CityCode;//市代号
    private  int provinceId;//所属省id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int cityCode) {
        CityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
