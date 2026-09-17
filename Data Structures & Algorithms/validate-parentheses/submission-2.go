func isValid(s string) bool {
    stack := make([]byte, 0, len(s))
    pairs := map[byte]byte{')': '(', ']': '[', '}': '{'}

    for i := 0; i < len(s); i++ {
        c := s[i]
        if open, ok := pairs[c]; ok {
            // 是右括號，檢查堆疊頂端是否匹配
            if len(stack) == 0 || stack[len(stack)-1] != open {
                return false
            }
            stack = stack[:len(stack)-1] // pop
        } else {
            stack = append(stack, c) // push
        }
    }
    return len(stack) == 0
}