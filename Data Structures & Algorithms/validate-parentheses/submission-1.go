func isValid(s string) bool {
    stack := make([]byte, 0, len(s))

    for i := 0; i < len(s); i++ {
        c := s[i]
        switch c {
        case '(':
            stack = append(stack, ')')
        case '{':
            stack = append(stack, '}')
        case '[':
            stack = append(stack, ']')
        default:
            // 是右括號:檢查 stack 是否為空,或 top 是否對得上
            if len(stack) == 0 || stack[len(stack)-1] != c {
                return false
            }
            stack = stack[:len(stack)-1] // pop
        }
    }

    return len(stack) == 0
}