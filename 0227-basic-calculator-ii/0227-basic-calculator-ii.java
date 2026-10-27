class Solution {
public int calculate(String s) {
Stack<Integer> stack = new Stack<>();
int num = 0;
char sign = '+';
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (Character.isDigit(ch)) {
            int a = ch - '0';
            num = num * 10 + a;
        }

        if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
            if (sign == '+') {
                stack.push(num);
            }
            else if (sign == '-') {
                stack.push(-num);
            }
            else if (sign == '*') {
                int a = stack.pop();
                stack.push(a * num);
            }
            else if (sign == '/') {
                int a = stack.pop();
                stack.push(a / num);
            }

            sign = ch;
            num = 0;
        }
    }

    int ans = 0;

    while (!stack.isEmpty()) {
        ans += stack.pop();
    }

    return ans;
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna