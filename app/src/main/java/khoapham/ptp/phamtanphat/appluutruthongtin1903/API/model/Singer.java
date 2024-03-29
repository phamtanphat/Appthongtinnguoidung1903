package khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Singer {

@SerializedName("id")
@Expose
private String id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("avatar")
@Expose
private String avatar;
@SerializedName("email")
@Expose
private String email;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getAvatar() {
return avatar;
}

public void setAvatar(String avatar) {
this.avatar = avatar;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

}