package user;

import java.util.Objects;

public class User <T> {

        private T userId;
        private int password;

        public User() {
        }

    public T getUserId() {
        return userId;
    }

    public int getPassword() {
            return password;
        }

        public Builder newBuilder() {
            return new User().new Builder();
        }

        public class Builder {

            private Builder() {
            }

            public Builder setUserId(String userId) {
                User.this.userId = (T) userId;

                return this;
            }

            public Builder setPassword(int password) {
                User.this.password = password;

                return this;
            }

            public User build() {
                return User.this;
            }

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password);
    }
}

