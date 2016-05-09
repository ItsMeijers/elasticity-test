package com.itsmeijers.utils

import sys.process._

object Stress {
  def stress(n: Int, p: Int, vm: Int) =
    "ls" ! //s"stress-ng --cpu $n --cpu-load $p --vm 1 --vm-bytes $vm" !
}
