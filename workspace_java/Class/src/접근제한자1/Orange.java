package 접근제한자1;

public  class Orange {

        //자바는 파일명과 클래스명이 일치해야함.

        ///접근 제한자
        // - 맴버변수, 메서드, 클래스의 사용 범위를 지정
        // public, default, protected, private.
        // public>default>protected>private

        /// public 선언된 변수와 메서드 : 같은 프로젝트라면 접근 가능
        ///  defualt 선언된  변수와 메서드 : 같은 패키지 내에서 접근 가능 선언하지 않고 자동임
        ///  private 선언된 변수와 메서드 : 변수 ,메서드를 선언한 클래스 안에서만 접근 가능
        // 클래스에는 private를 줄 수 없다.

        ///  결론 맴버변수에는 private 넣을 것 ///
        /// 메서드에는 무조건 public 넣을것 ///

        private int a; /// a변수는 private라서 다른 클래스에서 접근 불가;
        int b;
        public int c;
        private int price;

        public int getA() {
                return a;
        }

        public void setA(int a) {
                this.a = a;
        }

        public int getB() {
                return b;
        }

        public void setB(int b) {
                this.b = b;
        }

        public int getC() {
                return c;
        }

        public void setC(int c) {
                this.c = c;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        private void aaa(){}
        void bbb(){}
        public void ccc(){}

    }

