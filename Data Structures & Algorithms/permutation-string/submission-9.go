func checkInclusion(s1 string, s2 string) bool {
	if len(s1) > len(s2) {
		return false
	}

    var sig, match [26]int
    for _, v := range s1 {
        sig[v - 'a']++
    }

    l := 0
    r := len(s1)-1
    for i := 0; i < len(s1); i++ {
        match[s2[i] - 'a']++
    }

    for r + 1 < len(s2) {
        if sig == match {
            return true
        }
        r++
        match[s2[r] - 'a']++
        
        match[s2[l] - 'a']--
        l++
    }
    return sig == match
}
