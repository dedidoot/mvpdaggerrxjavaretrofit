
package com.yossh.mvpdaggerrxjavaretrofit.api;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CakesResponse {

    @SerializedName("cakes")
    private List<Cake> mCakes;
    @SerializedName("nextLink")
    private String mNextLink;
    @SerializedName("previousLink")
    private String mPreviousLink;
    @SerializedName("product")
    private String mProduct;
    @SerializedName("releaseDate")
    private String mReleaseDate;
    @SerializedName("version")
    private Long mVersion;

    public List<Cake> getCakes() {
        return mCakes;
    }

    public void setCakes(List<Cake> cakes) {
        mCakes = cakes;
    }

    public String getNextLink() {
        return mNextLink;
    }

    public void setNextLink(String nextLink) {
        mNextLink = nextLink;
    }

    public String getPreviousLink() {
        return mPreviousLink;
    }

    public void setPreviousLink(String previousLink) {
        mPreviousLink = previousLink;
    }

    public String getProduct() {
        return mProduct;
    }

    public void setProduct(String product) {
        mProduct = product;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public Long getVersion() {
        return mVersion;
    }

    public void setVersion(Long version) {
        mVersion = version;
    }

}
