puts (1...1000).select { |i| i % 5 == 0 || i % 3 == 0 }.reduce(:+)
